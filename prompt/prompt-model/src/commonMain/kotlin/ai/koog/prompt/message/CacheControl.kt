package ai.koog.prompt.message

import kotlinx.serialization.Serializable
import kotlin.time.Duration

/**
 * Cache control configuration for prompt caching.
 * Indicates that the LLM provider should cache content up to and including the element this is attached to.
 *
 * @property ttl Optional time-to-live for the cache entry. Provider-specific constraints apply.
 */
@Serializable
public data class CacheControl(val ttl: Duration? = null)
