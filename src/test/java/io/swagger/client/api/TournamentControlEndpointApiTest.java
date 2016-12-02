/*
 * Polling API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ResponseOutputModelInt64;
import io.swagger.client.model.ResponseOutputModelListTournamentMatchMessageModel;
import io.swagger.client.model.ResponseModel;
import io.swagger.client.model.ResponseOutputModelTournamentMatchCompleteOutputModel;
import io.swagger.client.model.ResponseOutputModelTournamentCompleteOutputModel;
import io.swagger.client.model.ResponseOutputModelTournamentPlayerContextModel;
import io.swagger.client.model.ResponseOutputModelListTournamentMatchMiniModel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TournamentControlEndpointApi
 */
public class TournamentControlEndpointApiTest {

    private final TournamentControlEndpointApi api = new TournamentControlEndpointApi();

    
    /**
     * Get the Int64 Ticks at time of last model generation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentGetProfileGenerationTicksTest() throws ApiException {
        String tournamentId = null;
        // ResponseOutputModelInt64 response = api.tournamentGetProfileGenerationTicks(tournamentId);

        // TODO: test validations
    }
    
    /**
     * Get the Int64 Ticks at time of last model generation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentMatchGetProfileGenerationTicksTest() throws ApiException {
        String tournamentMatchId = null;
        // ResponseOutputModelInt64 response = api.tournamentMatchGetProfileGenerationTicks(tournamentMatchId);

        // TODO: test validations
    }
    
    /**
     * Get a list of messages sent from the game server for this match
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentMatchMessageListTest() throws ApiException {
        String lastUpdatedDateTime = null;
        String tournamentMatchId = null;
        // ResponseOutputModelListTournamentMatchMessageModel response = api.tournamentMatchMessageList(lastUpdatedDateTime, tournamentMatchId);

        // TODO: test validations
    }
    
    /**
     * Get the profile and lobby for a specific tournament match
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentMatchProfileTest() throws ApiException {
        String lastUpdatedDateTime = null;
        String tournamentMatchId = null;
        // ResponseOutputModelTournamentMatchCompleteOutputModel response = api.tournamentMatchProfile(lastUpdatedDateTime, tournamentMatchId);

        // TODO: test validations
    }
    
    /**
     * Trigger Match Timed Processing, such as Map Voting
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentMatchTriggerTimedProcessingTest() throws ApiException {
        String tournamentMatchId = null;
        // ResponseModel response = api.tournamentMatchTriggerTimedProcessing(tournamentMatchId);

        // TODO: test validations
    }
    
    /**
     * Get the profile details for a specific tournament
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentProfileTest() throws ApiException {
        String lastUpdatedDateTime = null;
        String tournamentId = null;
        // ResponseOutputModelTournamentCompleteOutputModel response = api.tournamentProfile(lastUpdatedDateTime, tournamentId);

        // TODO: test validations
    }
    
    /**
     * Get the user context for a specific tournament
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentProfileUserContextTest() throws ApiException {
        String tournamentId = null;
        // ResponseOutputModelTournamentPlayerContextModel response = api.tournamentProfileUserContext(tournamentId);

        // TODO: test validations
    }
    
    /**
     * Get a list of pending assistance requests for a tournament
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentUnresolvedAssistanceListTest() throws ApiException {
        String tournamentId = null;
        // ResponseOutputModelListTournamentMatchMiniModel response = api.tournamentUnresolvedAssistanceList(tournamentId);

        // TODO: test validations
    }
    
}