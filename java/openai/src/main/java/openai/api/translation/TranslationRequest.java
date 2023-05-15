package openai.api.translation;

import openai.api.transcription.TranscriptRequest;

/**
 * Create translation of an audio file to english
 * <a href="https://platform.openai.com/docs/api-reference/audio/create">
 *     https://platform.openai.com/docs/api-reference/audio/create</a>
 * The enpoint URL for transaction is https://api.openai.com/v1/audio/translation
 *
 * <pre>
 *
 * </pre>
 * <p>According to current documentation as of May 2023, translation does the same thing
 * as transcription but returns the engglish text:
 * <i>
 *   The translations API takes as input the audio file in any of the supported languages and transcribes,
 *   if necessary, the audio into english. This differs from our /Transcriptions endpoint since the output
 *   is not in the original input language and is instead translated to english text.
 * </i>
 * </p>
 * <p>Note the endpoint for translation is different than transcript. Chances are this endpoint
 * will probably go away, since transcript could do this but gives you the option to change the
 * response language.</p>
 *
 * @author peter lin
 */
public class TranslationRequest extends TranscriptRequest {
}
