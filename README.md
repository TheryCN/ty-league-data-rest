# ty-league-data-rest
 
Test for Spring Data + Rest Repositories.

The example shows how to add business layer to rest repositories within the same transaction.

Next steps :
* Add more entities
* Use projections (such as dto)

How to deal with foreign key :

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