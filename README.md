# 📱 Cadastro de Usuário

Aplicativo Android desenvolvido para fins de aprendizado em desenvolvimento mobile utilizando Java.

O projeto permite o cadastro simples de usuários e a visualização dos nomes em uma lista dinâmica utilizando `RecyclerView`.

---

## 🚀 Funcionalidades

* 📋 **Listagem de Usuários**

  * Exibição dos nomes cadastrados com `RecyclerView`
  * Organização vertical com `LinearLayoutManager`

* ➕ **Cadastro de Usuário**

  * Navegação entre telas utilizando `Intent`
  * Inclusão de novos usuários

* 🔄 **Atualização Automática**

  * Atualização da lista ao retornar para a tela principal com `onResume()`

* 💾 **Persistência em Memória**

  * Uso de lista estática (`static List<String>`) compartilhada entre Activities

* 🏷️ **Item inicial**

  * Exibe um texto padrão quando a lista está vazia

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Android SDK

### Componentes principais:

* RecyclerView
* LinearLayoutManager
* Intent (navegação entre telas)
* LayoutInflater

---

## 📂 Estrutura do Projeto

### 🔹 MainActivity

Responsável pela tela principal:

* Inicializa o `RecyclerView`
* Define o `LayoutManager`
* Instancia o `UserAdapter`
* Gerencia navegação para cadastro
* Atualiza a lista com `notifyDataSetChanged()`

---

### 🔹 UserAdapter

Responsável por conectar os dados à interface:

* Recebe uma `List<String>` com os nomes dos usuários
* Utiliza o padrão **ViewHolder** para melhor performance
* Faz o binding dos dados com o layout

#### Principais métodos:

* `onCreateViewHolder()`

  * Infla o layout padrão `simple_list_item_1`

* `onBindViewHolder()`

  * Vincula o nome ao `TextView`

* `getItemCount()`

  * Retorna a quantidade de itens da lista

---

### 🔹 ViewHolder (Classe interna)

Responsável por armazenar referências da UI:

* Evita múltiplas chamadas de `findViewById`
* Melhora a performance da RecyclerView

```java
TextView tvNome;
```

---

### 🔹 CreateUser

* Tela responsável pelo cadastro de novos usuários

---

## 🔄 Fluxo da Aplicação

1. Usuário abre o app
2. Lista de nomes é carregada
3. Clica em **Cadastrar**
4. Vai para tela de cadastro
5. Adiciona um novo nome
6. Retorna para tela principal
7. Lista é atualizada automaticamente

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Abra no Android Studio

3. Aguarde a sincronização do Gradle

4. Execute em:

   * Emulador Android
   * Dispositivo físico (Android 5.0+)

---

## ⚠️ Observações técnicas

* Os dados são armazenados apenas em memória
* Não há persistência em banco de dados
* Ao fechar o app, os dados são perdidos

---

## 📌 Boas práticas aplicadas

* Uso de **RecyclerView + Adapter**
* Implementação do padrão **ViewHolder**
* Separação de responsabilidades (Activity vs Adapter)
* Atualização eficiente da UI com `notifyDataSetChanged()`

---

## 🚧 Melhorias futuras

* 💾 Persistência com Room (SQLite)
* 🌐 Integração com API REST
* ✅ Validação de campos
* ✏️ Edição de usuários
* 🗑️ Exclusão de registros
* 🔍 Busca na lista




---
*Projeto desenvolvido durante as aulas de Desenvolvimento Mobile.*
