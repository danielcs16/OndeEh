package br.com.daniel_castro.ondeeh.injection.module

import android.app.Application
import android.content.Context
import br.com.daniel_castro.ondeeh.base.BaseView
import br.com.daniel_castro.ondeeh.network.EnderecoAPI
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit

@Module
object ContextModule {

    @Provides
    @JvmStatic
    @Reusable
    fun provideContext(baseView: BaseView): Context {
        return baseView.getContext()
    }

    @Provides
    @JvmStatic
    @Reusable
    fun provideApplication(context: Context): Application {
        return context.applicationContext as Application
    }

    @Provides
    @JvmStatic
    @Reusable
    fun provideEnderecoAPI(retrofit: Retrofit): EnderecoAPI {
        return retrofit.create(EnderecoAPI::class.java)
    }




}