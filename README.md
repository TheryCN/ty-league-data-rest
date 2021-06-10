# ty-league-data-rest
 
Test for Spring Data + Rest Repositories.

The example shows how to add business layer to rest repositories within the same transaction.

Next steps :
* Add more entities
* Use projections (such as dto)

1. Spring Data REST

1.1. How to deal with foreign key :

```
POST /match
{
  "winner": "TEAMA",
   "id": {
       "teamA": "http://localhost:8080/teams/1", 
       "teamB": "http://localhost:8080/teams/2"
	}
}
```

2. How to trigger actions before/after

POST -> `@HandleBeforeCreate` (i.e. LeagueEventHandler#handleBeforeCreateLeague) -> CREATE -> `@HandleAfterCreate`

Detailed workflow :
- `@HandleBeforeCreate` do action before creation
- Creation is done
- `@HandleAfterCreate` do action after creation

3. How to enable actions on the same transaction (only for after actions)

POST -> `@HandleBeforeCreate`+`AbstractAggregateRoot#registerEvent` -> CREATE -> Spring Data Event Triggered -> Listener handle (i.e. `EventHandler#handle`)

Detailed workflow :
- The new entity extends `AbstractAggregateRoot`
- `@HandleBeforeCreate` register the Spring Data Event
- Creation is done
- Spring Data Event is triggered
- Listener handle the event within the same transaction

References :
* https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#core.domain-events
* https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference
* https://stackoverflow.com/questions/52241626/does-spring-data-rest-event-hanlders-use-separate-database-transactions