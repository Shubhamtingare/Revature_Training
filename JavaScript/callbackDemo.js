function doHomework(subject, callback) {
  callback();
  //   console.log("Finished my " + subject + " homework");
  console.log(`Finished my ${subject} homework`);
}

function alertFinished() {
  for (let index = 0; index < 10; index++) {
    console.log("Home work finished");
  }
}

doHomework("English", alertFinished);
