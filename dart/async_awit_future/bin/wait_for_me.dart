void main() async {
  waitForMe().then((_) {
    print("I'm more done THEN you :)");
  });
  print('I was waiting here :)');
}
Future waitForMe() async {
  print('Started.');
  return Future.delayed(Duration(seconds: 3), () {
    print("Now I'm done!");
  });
}