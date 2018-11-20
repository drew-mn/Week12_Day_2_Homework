## Kaiju Attack.

Model a Kaiju (Large Japanese Monster) Attack On A City.

1. Using a `Kaiju` abstract class, create two giant lizards to run amok in Tokyo.
- Parameters for each Kaiju should include `name`, `healthValue` and `attackValue`.
- Give the Kaiju a `roar` method which returns a string.
2. Using a `Vehicle` abstract class, create two Army vehicles to battle the Kaiju.
- Parameters should include `type` and `healthValue`.
3. Make an `IAttack` interface and an `IDamage` interface.
- `IAttack` should contain a method `attack` which takes in an `IDamage`.
- `IDamage` should contain a method `takeDamage` which takes in `int damage`.
4. Make the Kaiju and Vehicle implement both interface's.
5. Give the Kaiju a `move`/`fly` method, which returns a string (depending on the Kaiju).
6. Expand the model to include buildings, more Kaiju and anything else you can think of.
- The building should implement `IDamage` but not `IAttack`.
