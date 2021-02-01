package com.flyboy.fighters.model

data class Result <out T>(val status:Status,val data :T?,val error:String?,val message:String?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }


    companion object{
    fun <T> success(data:T?):Result<T>{
        return Result(Status.SUCCESS,data,null,null)
    }
    fun <T> loading(data: T? = null): Result<T> {
        return Result(Status.LOADING, data, null, null)
    }
    fun <T> error(message: String?,error: String?):Result<T>{

        return Result(Status.ERROR,null,message,error)
    }
}

}