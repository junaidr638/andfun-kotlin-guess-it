/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.guesstheword.screens.game.GameViewModel
import java.lang.IllegalArgumentException

class ScoreViewModelFactory(private val score : Int):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)){
            return ScoreViewModel(score) as T
        }
        throw IllegalArgumentException("Oops! Something went wrong in ScoreViewModel")
    }
}
// Copy over ScoreViewModelFactory - have it also take in a constructor parameter called
// finalScore
//  In the overridden create method, construct an instance of ScoreViewModel,
// passing in finalScore