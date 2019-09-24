
package app.ui

/**
 * State pattern context.
 */
interface Context {
    fun changeState(state: ConsoleState)
}
