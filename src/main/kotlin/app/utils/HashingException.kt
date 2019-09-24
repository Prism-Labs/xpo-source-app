//// //

package app.utils

class HashingException(val errors: List<Throwable>) : Exception()

class EmptyRepoException(message: String) : Exception(message)
