package com.leetib.inflectionclient.rest.dto;

import lombok.Data;

/**
 *
 *
 * 导航栏
 * [
 *   {
 *     "id": "ge-1",
 *     "label": "Add to my journal"
 *   },
 *   {
 *     "id": "ge-2",
 *     "label": "Help me prepare for an important conversation"
 *   },
 *   {
 *     "id": "ge-3",
 *     "label": "Help me feel calm"
 *   },
 *   {
 *     "id": "ge-4",
 *     "label": "I just want to vent"
 *   },
 *   {
 *     "id": "ge-5",
 *     "label": "Help me think something through"
 *   },
 *   {
 *     "id": "ge-6",
 *     "label": "Play a game"
 *   },
 *   {
 *     "id": "ge-7",
 *     "label": "Help me plan"
 *   },
 *   {
 *     "id": "ge-8",
 *     "label": "Help me find motivation"
 *   }
 * ]
 */
@Data
public class GuidedExperience {
    private String id;
    private String label;
}