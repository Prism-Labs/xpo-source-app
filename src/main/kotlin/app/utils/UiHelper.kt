//// //

package app.utils

import app.Logger

object UiHelper {
    fun confirm(message: String, defaultIsYes: Boolean): Boolean {
        val yes = if (defaultIsYes) "Y" else "y"
        val no = if (!defaultIsYes) "N" else "n"
        Logger.print("$message [$yes/$no]")
        val oppositeDefaultValue = if (defaultIsYes) no else yes
        if ((readLine() ?: "").toLowerCase() == oppositeDefaultValue) {
            return !defaultIsYes
        }
        return defaultIsYes
    }
}
