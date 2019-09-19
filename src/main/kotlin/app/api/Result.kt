

package app.api

data class Result<out T> (val data: T? = null, val error: ApiError? = null) {
    fun getOrThrow(): T {
        if (error == null) {
            return data!!
        }
        throw error
    }

    fun onErrorThrow() {
        if (error != null) {
            throw error
        }
    }
}
