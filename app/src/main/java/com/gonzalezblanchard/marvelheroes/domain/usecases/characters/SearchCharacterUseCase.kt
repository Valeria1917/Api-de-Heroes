package com.gonzalezblanchard.marvelheroes.domain.usecases.characters

import com.gonzalezblanchard.marvelheroes.domain.models.CharacterItem
import com.gonzalezblanchard.marvelheroes.domain.repositories.CharacterRepository
import javax.inject.Inject


class SearchCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(
        searchName: String
    ): List<CharacterItem> {
        return repository.searchCharacterFromDB(searchName)
    }

}
