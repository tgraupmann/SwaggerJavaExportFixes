
# TournamentMatchMessageModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **Long** | Internal ID representing this unique message object. |  [optional]
**tournamentMatchId** | **Long** | Internal platform ID representing this unique tournament match. |  [optional]
**messageDirection** | **Integer** | Represents the direction of the message.  (1) from the user-interface, (2) from the game server. |  [optional]
**message** | **String** | String message that was typed to be delivered. |  [optional]
**pendingServerProcessing** | **Boolean** | Flag denoting whether or not this item has been proceed by the game server yet. |  [optional]
**messageDateTime** | [**DateTime**](DateTime.md) | Universal timestamp representing the creation of this message object. |  [optional]



