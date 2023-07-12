package com.leetib.inflectionclient.rest.dto.chatstart;

import com.google.gson.Gson;
import com.leetib.inflectionclient.rest.dto.GuidedExperience;
import com.leetib.inflectionclient.rest.dto.LatestMessage;
import com.leetib.inflectionclient.rest.dto.Voice;
import lombok.Data;

import java.util.List;

/**
 * @author KongXiao
 * @date 2023-07-12 13:13
 */
@Data
public class StartResponse {
    private LatestMessage latestMessage;
    private Integer remainingTrialTurns;
    private List<Object> signInPrompts;
    private Boolean openerGenerated;
    private List<Voice> voices;
    private String preferredVoice;
    private List<Object> suggestedReplies;
    private List<String> featuresEnabled;
    private List<GuidedExperience> guidedExperiences;

    public static StartResponse parseJson(String jsonData) {
        return new Gson().fromJson(jsonData, StartResponse.class);
    }
}








