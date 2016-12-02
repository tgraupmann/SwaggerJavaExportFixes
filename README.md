# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.LookupsControlEndpointApi;

import java.io.File;
import java.util.*;

public class LookupsControlEndpointApiExample {

    public static void main(String[] args) {
        
        LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
        try {
            ResponseOutputModelListAddressCountryModel result = apiInstance.lookupsCountryList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LookupsControlEndpointApi#lookupsCountryList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://polling.arena.razerzone.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LookupsControlEndpointApi* | [**lookupsCountryList**](docs/LookupsControlEndpointApi.md#lookupsCountryList) | **GET** /API/Lookups/CountryList | Return list of all countries supported.
*LookupsControlEndpointApi* | [**lookupsGamePlatforms**](docs/LookupsControlEndpointApi.md#lookupsGamePlatforms) | **GET** /API/Lookups/GamePlatforms | Return a list of all game platforms.
*LookupsControlEndpointApi* | [**lookupsGameTitleCallbackTemplates**](docs/LookupsControlEndpointApi.md#lookupsGameTitleCallbackTemplates) | **GET** /API/Lookups/GameTitleCallbackTemplates | Return a list of all game join schemas.
*LookupsControlEndpointApi* | [**lookupsGameTitleValidationMethodTypes**](docs/LookupsControlEndpointApi.md#lookupsGameTitleValidationMethodTypes) | **GET** /API/Lookups/GameTitleValidationMethodTypes | Return a list of all player validation types.
*LookupsControlEndpointApi* | [**lookupsGamingServerRegions**](docs/LookupsControlEndpointApi.md#lookupsGamingServerRegions) | **GET** /API/Lookups/GamingServerRegions | Return a list of all game server region classifications.
*LookupsControlEndpointApi* | [**lookupsGetArenaRankList**](docs/LookupsControlEndpointApi.md#lookupsGetArenaRankList) | **GET** /API/Lookups/RankList | Return a list of all Arena Ranking Levels
*LookupsControlEndpointApi* | [**lookupsGetMapVotingTypes**](docs/LookupsControlEndpointApi.md#lookupsGetMapVotingTypes) | **GET** /API/Lookups/MapVotingTypes | Return a list of all round rule map voting and veto types.
*LookupsControlEndpointApi* | [**lookupsGetRosterRoles**](docs/LookupsControlEndpointApi.md#lookupsGetRosterRoles) | **GET** /API/Lookups/RosterRoles | Return a list of all team roster roles
*LookupsControlEndpointApi* | [**lookupsQualifierTieBreakerTypes**](docs/LookupsControlEndpointApi.md#lookupsQualifierTieBreakerTypes) | **GET** /API/Lookups/QualifierTieBreakerTypes | Return list of all tournament privacy types.
*LookupsControlEndpointApi* | [**lookupsStreamingServices**](docs/LookupsControlEndpointApi.md#lookupsStreamingServices) | **GET** /API/Lookups/StreamingServices | Return a list of all video streaming services.
*LookupsControlEndpointApi* | [**lookupsTournamentJoinTypes**](docs/LookupsControlEndpointApi.md#lookupsTournamentJoinTypes) | **GET** /API/Lookups/TournamentJoinTypes | Return list of all tournament privacy types.
*LookupsControlEndpointApi* | [**lookupsTournamentPairingTypes**](docs/LookupsControlEndpointApi.md#lookupsTournamentPairingTypes) | **GET** /API/Lookups/TournamentPairingTypes | Return a list of all tournament pairing types
*LookupsControlEndpointApi* | [**lookupsTournamentPrizeFundingTypes**](docs/LookupsControlEndpointApi.md#lookupsTournamentPrizeFundingTypes) | **GET** /API/Lookups/TournamentPrizeFundingTypes | Return a list of all tournament funding types.
*LookupsControlEndpointApi* | [**lookupsTournamentSeedingTypes**](docs/LookupsControlEndpointApi.md#lookupsTournamentSeedingTypes) | **GET** /API/Lookups/TournamentSeedingTypes | Return a list of all bracket seeding methods.
*LookupsControlEndpointApi* | [**lookupsTournamentTypes**](docs/LookupsControlEndpointApi.md#lookupsTournamentTypes) | **GET** /API/Lookups/TournamentTypes | Return a list of all tournament lifecycle types.
*NotificationsControlEndpointApi* | [**notificationList**](docs/NotificationsControlEndpointApi.md#notificationList) | **GET** /API/Notifications | Get a list of outstanding notifications for the logged in player
*PlatformControlEndpointApi* | [**platformMaintenanceStatus**](docs/PlatformControlEndpointApi.md#platformMaintenanceStatus) | **GET** /API/Platform/Maintenance/Status | Get the status of maintenance mode for the platform
*PlatformControlEndpointApi* | [**platformRazerCommsVersion**](docs/PlatformControlEndpointApi.md#platformRazerCommsVersion) | **GET** /API/Platform/Module/Razer/Comms/Version | Get the installed version of Razer comms for the logged in player
*PlatformControlEndpointApi* | [**platformTimeSynchronization**](docs/PlatformControlEndpointApi.md#platformTimeSynchronization) | **GET** /API/Platform/Synchronization/Time | 
*PlayerControlEndpointApi* | [**playerGetRank**](docs/PlayerControlEndpointApi.md#playerGetRank) | **GET** /API/Player/My/Rank | Lookup Arena rank of the logged in player
*PlayerControlEndpointApi* | [**playerIsAdmin**](docs/PlayerControlEndpointApi.md#playerIsAdmin) | **GET** /API/Player/My/Permissions/Admin | Lookup whether the logged in player is a SysAdmin
*PlayerControlEndpointApi* | [**playerLastMatchId**](docs/PlayerControlEndpointApi.md#playerLastMatchId) | **GET** /API/Player/My/Tournaments/Match/LastId | Get the latest Match ID for the logged in player
*PlayerControlEndpointApi* | [**playerMyActiveMatch**](docs/PlayerControlEndpointApi.md#playerMyActiveMatch) | **GET** /API/Player/My/Tournaments/Match/Active | Get the match ready for check-in for the logged in player, if exists
*SocialControlEndpointApi* | [**socialLatestFriendsSocial**](docs/SocialControlEndpointApi.md#socialLatestFriendsSocial) | **GET** /API/Social/Arena/Latest | Return latest Arena player social feed items based on friends list
*SocialControlEndpointApi* | [**socialLatestInsiderPosts**](docs/SocialControlEndpointApi.md#socialLatestInsiderPosts) | **GET** /API/Social/Insider/Latest | Return latest Razer Insider posts on the Arena forum
*SocialControlEndpointApi* | [**socialLatestTweets**](docs/SocialControlEndpointApi.md#socialLatestTweets) | **GET** /API/Social/Twitter/Latest | Return latest tweets by Razer Arena on Twitter
*StreamingControlEndpointApi* | [**streamingLatestLiveStreams**](docs/StreamingControlEndpointApi.md#streamingLatestLiveStreams) | **GET** /API/Streaming/Latest | Return a list of the top 12 latest live streams for any game
*StreamingControlEndpointApi* | [**streamingLatestLiveStreamsAdvancedSearch**](docs/StreamingControlEndpointApi.md#streamingLatestLiveStreamsAdvancedSearch) | **GET** /API/Streaming/Search | Return a list of the top latest live streams based on advanced search
*StreamingControlEndpointApi* | [**streamingLatestLiveStreams_0**](docs/StreamingControlEndpointApi.md#streamingLatestLiveStreams_0) | **GET** /API/Streaming/Latest/{topStreamCount} | Return a list of the latest live streams for any game
*StreamingControlEndpointApi* | [**streamingLatestLiveStreams_1**](docs/StreamingControlEndpointApi.md#streamingLatestLiveStreams_1) | **GET** /API/Streaming/{gameShortcode}/Latest/{topStreamCount} | Return a list of the latest live streams for a specific game
*TournamentControlEndpointApi* | [**tournamentGetProfileGenerationTicks**](docs/TournamentControlEndpointApi.md#tournamentGetProfileGenerationTicks) | **GET** /API/Tournament/{TournamentId}/GenerationTicks | Get the Int64 Ticks at time of last model generation
*TournamentControlEndpointApi* | [**tournamentMatchGetProfileGenerationTicks**](docs/TournamentControlEndpointApi.md#tournamentMatchGetProfileGenerationTicks) | **GET** /API/Tournament/Match/{TournamentMatchId}/GenerationTicks | Get the Int64 Ticks at time of last model generation
*TournamentControlEndpointApi* | [**tournamentMatchMessageList**](docs/TournamentControlEndpointApi.md#tournamentMatchMessageList) | **GET** /API/Tournament/Match/{TournamentMatchId}/Messaging | Get a list of messages sent from the game server for this match
*TournamentControlEndpointApi* | [**tournamentMatchProfile**](docs/TournamentControlEndpointApi.md#tournamentMatchProfile) | **GET** /API/Tournament/Match/{TournamentMatchId} | Get the profile and lobby for a specific tournament match
*TournamentControlEndpointApi* | [**tournamentMatchTriggerTimedProcessing**](docs/TournamentControlEndpointApi.md#tournamentMatchTriggerTimedProcessing) | **GET** /API/Tournament/Match/{TournamentMatchId}/Timer/Trigger | Trigger Match Timed Processing, such as Map Voting
*TournamentControlEndpointApi* | [**tournamentProfile**](docs/TournamentControlEndpointApi.md#tournamentProfile) | **GET** /API/Tournament/{TournamentId} | Get the profile details for a specific tournament
*TournamentControlEndpointApi* | [**tournamentProfileUserContext**](docs/TournamentControlEndpointApi.md#tournamentProfileUserContext) | **GET** /API/Tournament/{TournamentId}/Context | Get the user context for a specific tournament
*TournamentControlEndpointApi* | [**tournamentUnresolvedAssistanceList**](docs/TournamentControlEndpointApi.md#tournamentUnresolvedAssistanceList) | **GET** /API/Tournament/{TournamentId}/Assistance/Unresolved | Get a list of pending assistance requests for a tournament


## Documentation for Models

 - [AddressCountryModel](docs/AddressCountryModel.md)
 - [CommsModel](docs/CommsModel.md)
 - [EntityAdministratorProfileModel](docs/EntityAdministratorProfileModel.md)
 - [EntityProfileModel](docs/EntityProfileModel.md)
 - [EntityStreamingModel](docs/EntityStreamingModel.md)
 - [GameTitleCallbackTemplateModel](docs/GameTitleCallbackTemplateModel.md)
 - [GameTitleMapNameModel](docs/GameTitleMapNameModel.md)
 - [GameTitleOutputModel](docs/GameTitleOutputModel.md)
 - [GameTitleStatisticModel](docs/GameTitleStatisticModel.md)
 - [GameTitleStatisticMvpModel](docs/GameTitleStatisticMvpModel.md)
 - [GameTitleValidationMethodTypeModel](docs/GameTitleValidationMethodTypeModel.md)
 - [GamingServerModel](docs/GamingServerModel.md)
 - [GamingServerRegionModel](docs/GamingServerRegionModel.md)
 - [InsiderPostModel](docs/InsiderPostModel.md)
 - [MaintenanceModeModel](docs/MaintenanceModeModel.md)
 - [MatchPlayStatisticsModel](docs/MatchPlayStatisticsModel.md)
 - [NotificationActionModel](docs/NotificationActionModel.md)
 - [NotificationListModel](docs/NotificationListModel.md)
 - [NotificationMessageAttributeModel](docs/NotificationMessageAttributeModel.md)
 - [NotificationProfileCompleteOutputModel](docs/NotificationProfileCompleteOutputModel.md)
 - [NotificationProfileModel](docs/NotificationProfileModel.md)
 - [Object](docs/Object.md)
 - [PlayerRankingLevel](docs/PlayerRankingLevel.md)
 - [ResponseModel](docs/ResponseModel.md)
 - [ResponseOutputModelBoolean](docs/ResponseOutputModelBoolean.md)
 - [ResponseOutputModelCommsModel](docs/ResponseOutputModelCommsModel.md)
 - [ResponseOutputModelInt64](docs/ResponseOutputModelInt64.md)
 - [ResponseOutputModelListAddressCountryModel](docs/ResponseOutputModelListAddressCountryModel.md)
 - [ResponseOutputModelListEntityStreamingModel](docs/ResponseOutputModelListEntityStreamingModel.md)
 - [ResponseOutputModelListGameTitleCallbackTemplateModel](docs/ResponseOutputModelListGameTitleCallbackTemplateModel.md)
 - [ResponseOutputModelListGameTitleValidationMethodTypeModel](docs/ResponseOutputModelListGameTitleValidationMethodTypeModel.md)
 - [ResponseOutputModelListGamingServerRegionModel](docs/ResponseOutputModelListGamingServerRegionModel.md)
 - [ResponseOutputModelListInsiderPostModel](docs/ResponseOutputModelListInsiderPostModel.md)
 - [ResponseOutputModelListPlayerRankingLevel](docs/ResponseOutputModelListPlayerRankingLevel.md)
 - [ResponseOutputModelListSocialActionMessageModel](docs/ResponseOutputModelListSocialActionMessageModel.md)
 - [ResponseOutputModelListStreamingServiceModel](docs/ResponseOutputModelListStreamingServiceModel.md)
 - [ResponseOutputModelListString](docs/ResponseOutputModelListString.md)
 - [ResponseOutputModelListTeamRosterRoleModel](docs/ResponseOutputModelListTeamRosterRoleModel.md)
 - [ResponseOutputModelListTournamentJoinTypeModel](docs/ResponseOutputModelListTournamentJoinTypeModel.md)
 - [ResponseOutputModelListTournamentMatchMessageModel](docs/ResponseOutputModelListTournamentMatchMessageModel.md)
 - [ResponseOutputModelListTournamentMatchMiniModel](docs/ResponseOutputModelListTournamentMatchMiniModel.md)
 - [ResponseOutputModelListTournamentPairingTypeModel](docs/ResponseOutputModelListTournamentPairingTypeModel.md)
 - [ResponseOutputModelListTournamentPrizeFundingTypeModel](docs/ResponseOutputModelListTournamentPrizeFundingTypeModel.md)
 - [ResponseOutputModelListTournamentQualifierTieBreakerTypeModel](docs/ResponseOutputModelListTournamentQualifierTieBreakerTypeModel.md)
 - [ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel](docs/ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel.md)
 - [ResponseOutputModelListTournamentSeedingTypeModel](docs/ResponseOutputModelListTournamentSeedingTypeModel.md)
 - [ResponseOutputModelListTournamentTypeModel](docs/ResponseOutputModelListTournamentTypeModel.md)
 - [ResponseOutputModelListTweetModel](docs/ResponseOutputModelListTweetModel.md)
 - [ResponseOutputModelMaintenanceModeModel](docs/ResponseOutputModelMaintenanceModeModel.md)
 - [ResponseOutputModelNotificationProfileCompleteOutputModel](docs/ResponseOutputModelNotificationProfileCompleteOutputModel.md)
 - [ResponseOutputModelPlayerRankingLevel](docs/ResponseOutputModelPlayerRankingLevel.md)
 - [ResponseOutputModelSynchronizationTimeModel](docs/ResponseOutputModelSynchronizationTimeModel.md)
 - [ResponseOutputModelTournamentCompleteOutputModel](docs/ResponseOutputModelTournamentCompleteOutputModel.md)
 - [ResponseOutputModelTournamentMatchCompleteOutputModel](docs/ResponseOutputModelTournamentMatchCompleteOutputModel.md)
 - [ResponseOutputModelTournamentMatchMyActiveMatchModel](docs/ResponseOutputModelTournamentMatchMyActiveMatchModel.md)
 - [ResponseOutputModelTournamentPlayerContextModel](docs/ResponseOutputModelTournamentPlayerContextModel.md)
 - [SocialActionMessageAttributeModel](docs/SocialActionMessageAttributeModel.md)
 - [SocialActionMessageModel](docs/SocialActionMessageModel.md)
 - [StreamingServiceModel](docs/StreamingServiceModel.md)
 - [SynchronizationTimeModel](docs/SynchronizationTimeModel.md)
 - [TeamRosterRoleModel](docs/TeamRosterRoleModel.md)
 - [TournamentAnnouncementModel](docs/TournamentAnnouncementModel.md)
 - [TournamentCompleteOutputModel](docs/TournamentCompleteOutputModel.md)
 - [TournamentCoreModel](docs/TournamentCoreModel.md)
 - [TournamentJoinTypeModel](docs/TournamentJoinTypeModel.md)
 - [TournamentManagementPolicyModel](docs/TournamentManagementPolicyModel.md)
 - [TournamentMatchActionLogModel](docs/TournamentMatchActionLogModel.md)
 - [TournamentMatchAssistanceModel](docs/TournamentMatchAssistanceModel.md)
 - [TournamentMatchCompleteOutputModel](docs/TournamentMatchCompleteOutputModel.md)
 - [TournamentMatchDisputeModel](docs/TournamentMatchDisputeModel.md)
 - [TournamentMatchEndOfMapMvpAwardModel](docs/TournamentMatchEndOfMapMvpAwardModel.md)
 - [TournamentMatchEndOfMapPlayerStatisticModel](docs/TournamentMatchEndOfMapPlayerStatisticModel.md)
 - [TournamentMatchEndOfMapStatisticsModel](docs/TournamentMatchEndOfMapStatisticsModel.md)
 - [TournamentMatchEvidenceCompleteOutputModel](docs/TournamentMatchEvidenceCompleteOutputModel.md)
 - [TournamentMatchIssuedGamingServerModel](docs/TournamentMatchIssuedGamingServerModel.md)
 - [TournamentMatchMapVotingModel](docs/TournamentMatchMapVotingModel.md)
 - [TournamentMatchMapVotingResultModel](docs/TournamentMatchMapVotingResultModel.md)
 - [TournamentMatchMapsPlayedModel](docs/TournamentMatchMapsPlayedModel.md)
 - [TournamentMatchMessageModel](docs/TournamentMatchMessageModel.md)
 - [TournamentMatchMiniModel](docs/TournamentMatchMiniModel.md)
 - [TournamentMatchModel](docs/TournamentMatchModel.md)
 - [TournamentMatchMyActiveMatchModel](docs/TournamentMatchMyActiveMatchModel.md)
 - [TournamentMatchParticipantModel](docs/TournamentMatchParticipantModel.md)
 - [TournamentMatchPlaybackModel](docs/TournamentMatchPlaybackModel.md)
 - [TournamentMatchPlayerModel](docs/TournamentMatchPlayerModel.md)
 - [TournamentMatchStatisticsCompleteOutputModel](docs/TournamentMatchStatisticsCompleteOutputModel.md)
 - [TournamentPairingTypeModel](docs/TournamentPairingTypeModel.md)
 - [TournamentParticipantModel](docs/TournamentParticipantModel.md)
 - [TournamentParticipantQualifierTieBreakerModel](docs/TournamentParticipantQualifierTieBreakerModel.md)
 - [TournamentPayoutModel](docs/TournamentPayoutModel.md)
 - [TournamentPlayerContextModel](docs/TournamentPlayerContextModel.md)
 - [TournamentPredefinedStreamedMatchesModel](docs/TournamentPredefinedStreamedMatchesModel.md)
 - [TournamentPrizeFundingTypeModel](docs/TournamentPrizeFundingTypeModel.md)
 - [TournamentQualifierGroupModel](docs/TournamentQualifierGroupModel.md)
 - [TournamentQualifierModel](docs/TournamentQualifierModel.md)
 - [TournamentQualifierTieBreakerModel](docs/TournamentQualifierTieBreakerModel.md)
 - [TournamentQualifierTieBreakerTypeModel](docs/TournamentQualifierTieBreakerTypeModel.md)
 - [TournamentRoundRuleMapVotingStyleModel](docs/TournamentRoundRuleMapVotingStyleModel.md)
 - [TournamentRoundRulesCompleteOutputModel](docs/TournamentRoundRulesCompleteOutputModel.md)
 - [TournamentRoundRulesMapsModel](docs/TournamentRoundRulesMapsModel.md)
 - [TournamentSeedingTypeModel](docs/TournamentSeedingTypeModel.md)
 - [TournamentSponsorLinkModel](docs/TournamentSponsorLinkModel.md)
 - [TournamentSponsorsModel](docs/TournamentSponsorsModel.md)
 - [TournamentTypeModel](docs/TournamentTypeModel.md)
 - [TweetModel](docs/TweetModel.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



