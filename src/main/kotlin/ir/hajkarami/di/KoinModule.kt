package ir.hajkarami.di

import ir.hajkarami.repository.HeroRepository
import ir.hajkarami.repository.HeroRepositoryImpl
import org.koin.dsl.module


val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}