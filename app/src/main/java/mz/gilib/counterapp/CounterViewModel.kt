package mz.gilib.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var _count: MutableState<Int> = mutableIntStateOf(0)
    val count: MutableState<Int> = _count


    fun increment() {
        _count.value++
    }

    fun decrement() {
        if (_count.value > 0)
            _count.value--
    }
}