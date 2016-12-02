
# TournamentMatchCompleteOutputModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generationTicks** | **Long** |  |  [optional]
**administrators** | [**List&lt;EntityProfileModel&gt;**](EntityProfileModel.md) |  |  [optional]
**tournamentProfile** | [**TournamentCoreModel**](TournamentCoreModel.md) |  |  [optional]
**gamingServer** | [**GamingServerModel**](GamingServerModel.md) |  |  [optional]
**teamAPlayers** | [**List&lt;TournamentMatchPlayerModel&gt;**](TournamentMatchPlayerModel.md) |  |  [optional]
**teamBPlayers** | [**List&lt;TournamentMatchPlayerModel&gt;**](TournamentMatchPlayerModel.md) |  |  [optional]
**evidence** | [**List&lt;TournamentMatchEvidenceCompleteOutputModel&gt;**](TournamentMatchEvidenceCompleteOutputModel.md) |  |  [optional]
**issuedGamingServerHistory** | [**List&lt;TournamentMatchIssuedGamingServerModel&gt;**](TournamentMatchIssuedGamingServerModel.md) |  |  [optional]
**endOfMapStatistics** | [**TournamentMatchStatisticsCompleteOutputModel**](TournamentMatchStatisticsCompleteOutputModel.md) |  |  [optional]
**tournamentMatchStateId** | **Integer** |  |  [optional]
**tournamentMatchExtendedStateId** | **Integer** |  |  [optional]
**requireManualScoreReport** | **Boolean** |  |  [optional]
**tournamentMatchId** | **Long** |  |  [optional]
**tournamentId** | **Long** |  |  [optional]
**gameTitleId** | **Integer** |  |  [optional]
**isTeamTournament** | **Boolean** |  |  [optional]
**matchIsAwaitingMapVote** | **Boolean** |  |  [optional]
**matchIsLive** | **Boolean** |  |  [optional]
**matchLiveDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**matchIsComplete** | **Boolean** |  |  [optional]
**matchCompleteDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**matchIsFinalized** | **Boolean** |  |  [optional]
**matchFinalizedDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**enableMatchLobby** | **Boolean** |  |  [optional]
**allowCheckin** | **Boolean** |  |  [optional]
**allowCheckinDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**scheduledStartDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**scheduledForfeitDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**entityOwnerId** | **Long** |  |  [optional]
**entityOwnerProfile** | [**EntityProfileModel**](EntityProfileModel.md) |  |  [optional]
**entityParticipantA** | [**TournamentMatchParticipantModel**](TournamentMatchParticipantModel.md) |  |  [optional]
**entityParticipantB** | [**TournamentMatchParticipantModel**](TournamentMatchParticipantModel.md) |  |  [optional]
**roundNumber** | **Integer** |  |  [optional]
**roundLevelTypeId** | **Integer** |  |  [optional]
**matchNumber** | **Integer** |  |  [optional]
**numberOfMaps** | **Integer** |  |  [optional]
**mapNumber** | **Integer** |  |  [optional]
**currentGameTitleMapNameId** | **Integer** |  |  [optional]
**gameTitleMapFileName** | **String** |  |  [optional]
**gameTitleMapProperName** | **String** |  |  [optional]
**gamingServerRegionId** | **Integer** |  |  [optional]
**gamingServerRegionName** | **String** |  |  [optional]
**isBracket** | **Boolean** |  |  [optional]
**allowRescheduling** | **Boolean** |  |  [optional]
**willBroadcast** | **Boolean** |  |  [optional]
**broadcastUrl** | **String** |  |  [optional]
**automaticGoLiveOnSchedule** | **Boolean** |  |  [optional]
**minutesAfterStartToForfeit** | **Integer** |  |  [optional]
**minutesBeforeStartToAllowCheckin** | **Integer** |  |  [optional]
**serverSendPlayerSummaryStatistics** | **Boolean** |  |  [optional]
**gamingServerId** | **Integer** |  |  [optional]
**entityPlayerControllerId** | **Long** |  |  [optional]
**allTeamAPlayersReady** | **Boolean** |  |  [optional]
**teamAIsReady** | **Boolean** |  |  [optional]
**allTeamBPlayersReady** | **Boolean** |  |  [optional]
**teamBIsReady** | **Boolean** |  |  [optional]
**scoreManuallyReportedDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**scoreManuallyReported** | **Boolean** |  |  [optional]
**scoreManuallyReportedByPlayerId** | **Long** |  |  [optional]
**scoreManuallyReportedByTeamA** | **Boolean** |  |  [optional]
**scoreManuallyApplyToEntireRound** | **Boolean** |  |  [optional]
**mapsPlayed** | [**List&lt;TournamentMatchMapsPlayedModel&gt;**](TournamentMatchMapsPlayedModel.md) |  |  [optional]
**dispute** | [**TournamentMatchDisputeModel**](TournamentMatchDisputeModel.md) |  |  [optional]
**newServerRequested** | **Boolean** |  |  [optional]
**newServerRequestedEntityId** | **Long** |  |  [optional]
**newServerRequestedByTeamA** | **Boolean** |  |  [optional]
**newServerRequestedCount** | **Integer** |  |  [optional]
**needsAssistance** | **Boolean** |  |  [optional]
**allowedSpectators** | **String** |  |  [optional]
**streamingServiceId** | **Integer** |  |  [optional]
**manualMode** | **Boolean** |  |  [optional]
**manualServerConnectionInfo** | **String** |  |  [optional]
**streamingService** | [**StreamingServiceModel**](StreamingServiceModel.md) |  |  [optional]
**assistanceRequests** | [**List&lt;TournamentMatchAssistanceModel&gt;**](TournamentMatchAssistanceModel.md) |  |  [optional]
**lastUpdatedDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**serverConfigurationFileName** | **String** |  |  [optional]
**matchConnectionInstructions** | **String** |  |  [optional]
**matchAdministratorId** | **Long** |  |  [optional]
**actionLog** | [**List&lt;TournamentMatchActionLogModel&gt;**](TournamentMatchActionLogModel.md) |  |  [optional]
**playback** | [**List&lt;TournamentMatchPlaybackModel&gt;**](TournamentMatchPlaybackModel.md) |  |  [optional]
**qualifierGroupNumber** | **Integer** |  |  [optional]
**isQualifier** | **Boolean** |  |  [optional]
**hasTieBreaker** | **Boolean** |  |  [optional]
**tieBreakerCount** | **Integer** |  |  [optional]
**mapVotingResult** | [**TournamentMatchMapVotingModel**](TournamentMatchMapVotingModel.md) |  |  [optional]


