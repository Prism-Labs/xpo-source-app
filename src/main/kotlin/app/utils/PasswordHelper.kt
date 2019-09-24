//// //

package app.utils

import org.apache.commons.codec.digest.DigestUtils
import java.io.IOError

/**
 * Class for hashing and reading passwords.
 */
object PasswordHelper {
    fun hashPassword(password: String): String {
        return if (password.isEmpty()) {
            ""
        }
        else {
            password
        }
    }

    fun readPassword(): String {
        val password: String
        val console = System.console()
        if (console != null) {
            password = try {
                System.console().readPassword().joinToString("")
            } catch (e: IOError) {
                ""
            }
        } else {
            password = readLine() ?: ""
        }

        return password
    }
}
