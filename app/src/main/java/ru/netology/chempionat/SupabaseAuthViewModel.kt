package ru.netology.chempionat

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.launch
import ru.netology.chempionat.SupabaseClient.client

class SupabaseAuthViewModel: ViewModel() {
    fun signUp(
        context: Context,
        userEmail: String,
        userPassword:String,
        ){
        viewModelScope.launch {
            try{
                client.gotrue.signUpWith(Email){
                    email=userEmail
                    password = userPassword
                }
                val text = "Регистрация прошла успешно!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(context,text,duration)
                toast.show()
            }
            catch (e:Exception){

            }
        }
    }
}