OkHttpClient client = new OkHttpClient();

String run(String url) throws IOException {
  Request request = new Request.Builder()
      .get()
      .url(url)
      .build();

  try (Response response = client.newCall(request).execute()) {
    return response.body().string();
  }
}



String post(String url, String json) throws IOException {
  RequestBody body = RequestBody.create(json, JSON);
  Request request = new Request.Builder()
      .url("http://api.riscology.com/testing")
      .post(body)
      .addHeader("X-Riscology-TKN", "sdklfjasdiofsadiogasd-dafasdfasdfasdf")
      .addHeader()
      .build();
  try (Response response = client.newCall(request).execute()) {
    return response.body().string();
  }
}


if(SharedPreference.getlogin(mcontext).equals("")){
                        request = request.newBuilder()
                                .addHeader("Accept", "application/json")
                                .addHeader("Authorization", "Bearer "+SharedPreference.gettoken(mcontext))
                                .build();
                    }
                    else {
                        request = request.newBuilder()
                                .addHeader("Accept", "application/json")
                                .addHeader("X-riscosity-tk", gettoken).build();
                    }
