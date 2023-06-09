# murmurio
murmur.io is a set of libraries for OpenAI API. Right now murmur the name, but it could change in the future.

## OpenAI documentation

[https://platform.openai.com/docs/introduction] OpenAi developer documentation

## Goals

The goal is to provide use friendly client for OpenAI API. It should provide these features:

* fluent API for making  REST calls
* support sync and async calls
* handle timeouts and retries
* handle exceptions and errors in a reasonable manner
* handle versioning as OpenAI evolves the API
* handle upload of audio files gracefully
* secure the access token
* provide good user friendly documentation and examples
* support Java, C# and Javascript
* support cloud keystore for securing API key
* publish the code to maven central

## Getting Started

TBD

## Examples

TBD

## Milestones

1. base set of OpenAI classes
2. design the services
3. design the client command line tools
4. setup nightly build to maven central

## Why another library for OpenAI?

OpenAI uses access tokens for security. If you were to use the access token in the browser, a hacker can easily grab your token and abuse it. It is safer to setup your own service that uses the access token and the browser makes requests to your service. This way, the browser communication can use OpenID for authentication and authorization to your service. If a hacker gets access to a user's session token, you just expire that token and ask the user to login again.

### Official OpenAI example for Node

```javascript
const { Configuration, OpenAIApi } = require("openai");
const configuration = new Configuration({
  apiKey: process.env.OPENAI_API_KEY,
});
const openai = new OpenAIApi(configuration);
const response = await openai.createCompletion({
  model: "text-davinci-003",
  prompt: "Say this is a test",
  temperature: 0,
  max_tokens: 7,
});
```

Notice the example creates a new instance of Configuration and reads the API key from environment. If you were to do the same thing from a simple webpage, the API key would have to be in the javascript. Basically, don't expose your API key. The example from OpenAI is meant to be run from NodeJS as a service. There's quite a few javascript libraries that wrap OpenAI javascript library. Most of them don't handle exceptions and leaves it up to the developer. Errors happen and you should always handle error conditions. If you're running on Azure, the API key should be stored in a keyvault.

Instead of reading OPENAI_API_KEY from the enviroment variables, the code would read the keyvault name, make a connection to the vault and then use the API key to send requests to OpenAI. The cloud admin should grant the application access to the keyvault and manage the API key through the keyvault.

This also means the code should not arbitrarily write the API key to the log where any developer can see it. Security should be a first principal concern and not "an after thought."

## Dependencies to external libraries

A common complaint of open source libraries is bloated external dependencies that cause version conflicts. We will do our best to limit external libraries and reduce the chance of version conflicts. Where it makes sense to use existing open source library, that will be the preferred approach to reduce development time. If we discover a library causes too much friction with other popular libraries, we will evaluate and decide on a case-by-cases basis.


## JSON Schema

A sad fact is OpenAI doesn't provide JSON schema for any of the models. The project is gradually creating the JSON schema definition and will attempt to document it thoroughly.
