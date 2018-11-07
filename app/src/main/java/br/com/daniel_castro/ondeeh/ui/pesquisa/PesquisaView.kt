package br.com.daniel_castro.ondeeh.ui.pesquisa

import br.com.daniel_castro.ondeeh.base.BaseView
import br.com.daniel_castro.ondeeh.model.Endereco

interface PesquisaView : BaseView{

    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro: String)

    fun showLoading()

    fun hideLoading()
}