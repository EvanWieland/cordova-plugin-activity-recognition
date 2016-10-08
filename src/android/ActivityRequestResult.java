package cordova.plugin.activity.recognition;

import org.json.JSONException;
import org.json.JSONObject;

public class ActivityRequestResult {
  public String ActivityType;
  public int Probability;

  public ActivityRequestResult() {
    ActivityType = "NoActivityYet";
    Probability = 0;
  }

  public JSONObject GetJSONObject() throws JSONException {
    JSONObject result = new JSONObject();
    result.put("ActivityType", ActivityType);
    result.put("Probability", Probability);
    return result;
  }
}
