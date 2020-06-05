/*

Why are Streams?

      Streams provide an asynchronous sequence of data.
How stream and Future are similar?

      Both works asynchronously

      Both have some potential value

How stream and Future are different?

      A stream is a combination of Futures

      Future has only one response but Stream could have any number of Response.

*/

// asynchronous data 
// asynchronous data 
main() async {
  Duration interval = Duration(seconds: 2);
  Stream<int> stream = Stream<int>.periodic(interval,callback(4));
  await for(int i in stream){
    print(i);
  }
}
// This callback modify the given value to even number.
int callback(int value){
  return ( value );
}