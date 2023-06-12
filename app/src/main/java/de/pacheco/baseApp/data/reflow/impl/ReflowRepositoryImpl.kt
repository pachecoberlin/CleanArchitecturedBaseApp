package de.pacheco.baseApp.data.reflow.impl

import de.pacheco.baseApp.data.reflow.ReflowRepository
import de.pacheco.baseApp.entities.Reflow

class ReflowRepositoryImpl : ReflowRepository {
    override fun getReflows(): List<Reflow> {
        return listOf(Reflow("yes"),Reflow("yes"),Reflow("yooo"))
    }

}
