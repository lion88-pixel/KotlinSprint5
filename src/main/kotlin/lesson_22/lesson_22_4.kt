package lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()
        private set

    fun loadData() {
        println("State 1: ${mainScreenState}")
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("State 2: ${mainScreenState}")
        Thread.sleep(2000)
        mainScreenState = mainScreenState.copy(data = "Данные с сервера", isLoading = false)
        println("State 3: ${mainScreenState}")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}