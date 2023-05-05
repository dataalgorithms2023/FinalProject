package com.example.finalproject

class network {val client = AsyncHttpClient()
    val params = RequestParams()
    params["limit"] = "5"
    params["page"] = "0"
    client["https://api.thecatapi.com/v1/images/search", params, object :
        TextHttpResponseHandler() {
        override fun onSuccess(statusCode: Int, headers: Headers, response: String) {
            // called when response HTTP status is "200 OK"
        }

        override fun onFailure(
            statusCode: Int,
            headers: Headers?,
            errorResponse: String,
            t: Throwable?
        ) {
            // called when response HTTP status is "4XX" (eg. 401, 403, 404)
        }
    }
}
val params = RequestParams()
params["limit"] = "5"
params["page"] = "0"

client["https://api.thecatapi.com/v1/images/search", params, object :
    JsonHttpResponseHandler() {
    override fun onSuccess(statusCode: Int, headers: Headers, json: JSON) {
        // Access a JSON array response with `json.jsonArray`
        Log.d("DEBUG ARRAY", json.jsonArray.toString())
        // Access a JSON object response with `json.jsonObject`
        Log.d("DEBUG OBJECT", json.jsonObject.toString())
    }

    override fun onFailure(
        statusCode: Int,
        headers: Headers?,
        response: String,
        throwable: Throwable?
    ) {
    }
}]

