package de.pacheco.baseApp.data.reflow

import de.pacheco.baseApp.entities.Reflow

interface ReflowRepository {
    fun getReflows(): List<Reflow>
}
