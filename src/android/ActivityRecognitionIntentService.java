package cordova.plugin.activity.recognition;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;

public class ActivityRecognitionIntentService extends IntentService {
  public static ActivityRequestResult Activity;

  public ActivityRecognitionIntentService() {
    super("ActivityRecognitionIntentService");
  }

  private String ConvertActivityCodeToString(DetectedActivity Activity) {
    switch (Activity.getType()) {
      case DetectedActivity.IN_VEHICLE:
        return "IN_VEHICLE";
      case DetectedActivity.ON_BICYCLE:
        return "ON_BICYCLE";
      case DetectedActivity.ON_FOOT:
        return "ON_FOOT";
      case DetectedActivity.RUNNING:
        return "RUNNING";
      case DetectedActivity.STILL:
        return "STILL";
      case DetectedActivity.TILTING:
        return "TILTING";
      case DetectedActivity.WALKING:
        return "WALKING";
    }

    return "UNKNOWN";
  }

  @Override
  protected void onHandleIntent(Intent intent) {
    if (ActivityRecognitionResult.hasResult(intent)) {
      ActivityRecognitionResult result = ActivityRecognitionResult.extractResult(intent);
      DetectedActivity CurrentActivity = result.getMostProbableActivity();

      Activity.ActivityType = ConvertActivityCodeToString(CurrentActivity);
      Activity.Propability = CurrentActivity.getConfidence();
    } else {
      Activity.ActivityType = "NoResult";
    }
  }
}
