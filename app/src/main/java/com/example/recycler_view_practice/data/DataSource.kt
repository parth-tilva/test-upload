package com.example.recycler_view_practice.data

class DataSource {
    fun loadData(): List<Char> {
        return ('A').rangeTo('Z').toList()
    }
}