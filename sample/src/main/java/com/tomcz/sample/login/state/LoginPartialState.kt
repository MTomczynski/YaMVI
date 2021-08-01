package com.tomcz.sample.login.state

import com.tomcz.mvi.PartialState

sealed interface LoginPartialState : PartialState<LoginState> {
    object ShowLoading : LoginPartialState {
        override fun reduce(oldState: LoginState): LoginState = oldState.copy(isLoading = true)
    }

    object HideLoading : LoginPartialState {
        override fun reduce(oldState: LoginState): LoginState = oldState.copy(isLoading = true)
    }
}
