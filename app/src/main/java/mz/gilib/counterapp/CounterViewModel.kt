package mz.gilib.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count: MutableState<Int> = mutableIntStateOf(_repository.getCounter().count)
    val count: State<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}