main() async {
      String x = await HelloAsync();
      print(x);
    }

    Future<String> HelloAsync() async{
       await Future.delayed(Duration(seconds:5));
       return 'Message from Future.';
    }