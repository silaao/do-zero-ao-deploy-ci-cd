import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Compose Desktop Test") {
        var count by remember { mutableStateOf(0) }

        MaterialTheme {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text("App de Teste Compose Desktop") })
                }
            ) {
                Column {
                    Text("Você clicou $count vezes.")
                    Button(
                        onClick = { count++ },
                        modifier = androidx.compose.ui.Modifier.padding(16.dp)
                    ) {
                        Text("Clique aqui")
                    }
                }
            }
        }
    }
}
