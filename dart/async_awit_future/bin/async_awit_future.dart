void main() async {
  waitForMe().then((value) => {
    
  });
  getMeSomeFood().then((value) => {
    print(value)
  });         
  print(await getMeSomethingBetter());       
  maybeSomethingSweet().then((String value) {
    print(value);                    
  });
}
Future<String> getMeSomeFood() async {
  return "an apple";
}
Future<String> getMeSomethingBetter() async {
  return "a burger?";
}
Future<String> maybeSomethingSweet() async {
  return "a chocolate cake!!";
}
Future<String> bye() async{          //will not compile, add async
  return "see you soon! :)";
}

/*

Async means that this function is asynchronous and you might need to wait a bit to get its result.

Await literally means - wait here until this function is finished and you will get its return value.

Future is a type that ‘comes from the future’ and returns value from your asynchronous function. It can complete with success(.then) or with
an error(.catchError).

.Then((value){…}) is a callback that’s called when future completes successfully(with a value).



As you could see, there’s no difference between .then and await 
when it comes to fetching results. But be careful, 
when you use await, your program will wait there until async function finishes:

*/

Future waitForMe() async {
  print('Started.');
  return Future.delayed(Duration(seconds: 5), () {
    print("This is wait method. Now I'm done!");
  });
}