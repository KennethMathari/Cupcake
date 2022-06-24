package com.example.cupcake.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class OrderViewModelTest {

    val orderViewModel = OrderViewModel()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_twelve_cupcakes() {
        orderViewModel.quantity.observeForever {}
        orderViewModel.setQuantity(12)
        assertEquals(12, orderViewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes(){
        orderViewModel.price.observeForever {}
        orderViewModel.setQuantity(12)
        assertEquals("$27.00", orderViewModel.price.value)
    }

}