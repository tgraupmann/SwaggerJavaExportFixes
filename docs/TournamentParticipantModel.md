
# TournamentParticipantModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tournamentId** | **Long** |  |  [optional]
**entityParticipantId** | **Long** |  |  [optional]
**entityParticipantProfile** | [**EntityProfileModel**](EntityProfileModel.md) |  |  [optional]
**joinDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**isChallengeAggrssor** | **Boolean** |  |  [optional]
**tournamentRoleId** | [**TournamentRoleIdEnum**](#TournamentRoleIdEnum) |  |  [optional]
**tournamentRoleName** | **String** |  |  [optional]
**isAccepted** | **Boolean** |  |  [optional]
**statistics** | [**MatchPlayStatisticsModel**](MatchPlayStatisticsModel.md) |  |  [optional]
**finalPlacement** | **Integer** |  |  [optional]
**seededPlacement** | **Integer** |  |  [optional]
**flaggedAsCheater** | **Boolean** |  |  [optional]
**hasDismissedResults** | **Boolean** |  |  [optional]
**prizeAwardedAmount** | **Double** |  |  [optional]
**otherPrizeAwarded** | **String** |  |  [optional]
**matchPlayStatisticsId** | **Long** |  |  [optional]
**isCheckedIn** | **Boolean** |  |  [optional]
**checkedInDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**isStandBy** | **Boolean** |  |  [optional]
**standByPosition** | **Integer** |  |  [optional]
**qualifierGroupNumber** | **Integer** |  |  [optional]
**qualifierGroupSeedNumber** | **Integer** |  |  [optional]
**qualifierWinCount** | **Integer** |  |  [optional]
**qualifierLossCount** | **Integer** |  |  [optional]
**qualifierTieCount** | **Integer** |  |  [optional]
**qualifierTotalPoints** | **Integer** |  |  [optional]
**qualifierLastTotalPoints** | **Integer** |  |  [optional]
**qualifierRankingPosition** | **Integer** |  |  [optional]
**qualifierLastRankingPosition** | **Integer** |  |  [optional]
**qualifierScoreLastUpdate** | [**DateTime**](DateTime.md) |  |  [optional]
**qualifierCurrentRoundNumber** | **Integer** |  |  [optional]
**quitAfterLive** | **Boolean** |  |  [optional]
**quitAfterLiveDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**removedAfterLive** | **Boolean** |  |  [optional]
**removedAfterLiveDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**qualifierTieBreakers** | [**List&lt;TournamentParticipantQualifierTieBreakerModel&gt;**](TournamentParticipantQualifierTieBreakerModel.md) |  |  [optional]


<a name="TournamentRoleIdEnum"></a>
## Enum: TournamentRoleIdEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3



