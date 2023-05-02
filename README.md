# murmurio
murmur.io is a set of libraries for OpenAI API. Right now murmur the name, but it could change in the future.

## OpenAI documentation

[https://platform.openai.com/docs/introduction] OpenAi developer documentation

## Goals

At a high level, the goal of the project is to provide use friendly client for OpenAI Whisper API. It should provide these features:

* fluent API for making  REST calls
* support sync and async calls
* handle timeouts and retries
* handle exceptions and errors in a reasonable manner
* handle versioning as OpenAI evolves the API
* handle upload of audio files gracefully
* secure the access token
* provide good user friendly documentation and examples
* support Java, C# and Javascript

## Getting Started

TBD

## Examples

TBD

## Milestones

TBD

## Why another Javascript client for OpenAI?

OpenAI uses access tokens for security. If you were to use the access token in the browser, a hacker can easily grab your token and abuse it. It is safer to setup your own service that uses the access token and the browser makes requests to your service. This way, the browser communication can use OpenID for authentication and authorization to your service. If a hacker gets access to a user's session token, you just expire that token and ask the user to login again. Your OpenID token is safe.

## Dependencies to external libraries

A common complaint of open source libraries is bloated external dependencies that cause version conflicts. We will do our best to limit external libraries and reduce the chance of version conflicts. Where it makes sense to use existing open source library, that will be the preferred approach to reduce development time. If we discover a library causes too much friction with other popular libraries, we will evaluate and decide on a case-by-cases basis.


