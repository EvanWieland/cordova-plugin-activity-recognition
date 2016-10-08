var exec = require('cordova/exec');

exports.GetActivity = function(
    success,
    error) {
  // success({ActivityType,Probability}) , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "GetActivity", []);
};

exports.Connect = function(success, error) {
  // success() , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "Connect", []);
};

exports.Disconnect = function(success,
                               error) {
  // success() , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "Disconnect", []);
};

exports.StartActivityUpdates = function(
    interval, success, error) {
  // success() , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "StartActivityUpdates",
       [ interval ]);
};

exports.StopActivityUpdates = function(
    success, error) {
  // success() , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "StopActivityUpdates", []);
};

exports.Destroy = function(
    success, error) {
  // success() , error(ErrorMessage)
  exec(success, error, "ActivityRecognitionPlugin", "Destroy", []);
};
