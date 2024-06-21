package com.example.terminal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.terminal.test.Test
import com.example.terminal.ui.theme.TerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TerminalTheme {
                Test()

//                val viewModel: TerminalViewModel = viewModel()
//                val screenState = viewModel.state.collectAsState()
//                when (val currentState = screenState.value) {
//
//                    is TerminalScreenState.Initial ->{
//
//                    }
//
//                    is TerminalScreenState.Content -> {
//                        Terminal(bars = currentState.barList)
//                    }
//                }

            }
        }
    }
}
