## Respository for Project 2 for CS 321 - Object Oriented Programming with Java
Replicated problem statement and requirements are shown below:

# Project 2 Specification B -- Medieval Combat Tournament
## Analysis
### Problem Statement
Design a piece of software that simulates a medieval combat tournament, with entrants of different physical parameters and weapon choices. The entrants have two physical parameters -- strength, reach, and speed. The weapons have three archetypes -- long, medium, and short. Each weapon, regardless of archetype, has a defense and an offense bonus. To win a match in the tournament, a fighter must score 10 points of damage on his opponent.

The purpose of this program will be to create, record, and print an entertaining combat record to the console that shows the unique strengths of each kind of weapon. To facilitate this, each tournament shall have an associated Jester who will comment on the progress and outcome of a match.

A tournament will consist of 4 sub-tournaments -- a long-weapon tournament, a medium-weapon tournament, a short-weapon tournament, and a wild tournament where contestants may use any weapon they choose.

### Parameter Specification
This section describes how different weapon archetypes do battle, and how a fighter’s physical prowess factor into their ability to attack and defend.

### Combat
Weapon-based combat takes place across two factors -- ratings and performance.

A weapon’s **rating** symbolizes how well it can perform on attack or defense, recorded on a
scale of 1 through 6. Greater ratings represent greater prowess in combat.

In each round of combat, a combattant will obtain **performance** from their weapon, both in
attack and defense. For every point of attack or defense rating a weapon has, a six-sided die is
rolled. The sum of these dice determines the total attack value or defense performance that a
fighter receives that round.

After values have been calculated, each fighter takes damage equal to his opponent’s attack performance minus his own defense performance. Combat ends when a fighter has received 10 damage, and his opponent is declared the winner. If both combatants fall in the same round, the match is reset and continues until there is a one-sided victory.

### Weapons
Weapons are broken down into three archetypes -- long, medium, and short.

### Ratings
#### Long Weapons
| Weapon Name | Attack Rating | Defense Rating
| --- | --- | --- |
| Halberd | 3 | 0 |
| Lance | 1 | 2 |
| Two-handed sword | 2 | 2 |

#### Medium Weapons
| Weapon Name | Attack Rating | Defense Rating |
| --- | --- | --- |
| Staff | 1 | 3 |
| Hand-and-a-half sword | 3 | 2 |
| Rapier | 3 | 1 |

#### Short Weapons
| Weapon Name | Attack Rating | Defense Rating |
| --- | --- | --- |
| Dagger | 4 | 1 |
| Cestus | 5 | 0 |
| Gladius | 3 | 3 |

### Fighters
Fighters have three attributes -- strength, reach, and speed. Each is measured on a scale of 1 to 10.

A fighter’s strength is how much force their blows carry. For the duration of the match, the stronger fighter gets an extra 1 point to their attack rating.

A fighter’s reach is how long their limbs are. For the duration of the match, the longer-reached fighter gets an extra 1 point to their defense rating.

A fighter’s speed is how quickly they can move. If combat is taking place between two different weapon archetypes (such as a long weapon and a medium weapon), the fighter with the greater speed gets an extra 1 rating to both attack and defense ratings for the duration of the match.

### Jester
The Jester is a non-mechanical character who exists to commentate on the progress of matches. For each match, the Jester should remark on who he thinks will win the match based on physical attributes. After each match, the Jester should remark on whether his expectations were met. During each match, the Jester should comment when a fighter has received half of the damage he has available before losing.

### Tournaments
Sub-tournaments will always be “full” -- the number of entrants will be a power of 2. When prompting the user for the participant count, do not allow the user to proceed if they specify a non-power-of-2 number of entrants.

## Design
### CRC Cards
[Click here to view an image of the CRC cards](https://imgur.com/cpiQIjT)

### UML Diagram
[Click here to view an image of the UML diagram](https://imgur.com/H2aHw6d)

### Use Case
#### Case: User Runs a Tournament
1. Menu presents the user with a list of options.
2. The user indicates that they wish to run a tournament.
3. Menu asks the user for how many matches should be in each sub-tournament.
4. Menu tells Tournament to initialize.
5. Tournament creates the fighters for the fixed-archetype tournaments. Tournament gives them names, attributes, and weapons.
6. Tournament creates the fighters for the wild tournament. Tournament gives them names, attributes, and weapons.
7. Tournament composes the sub-tournaments into a single tournament.
8. Menu tells the tournament to find a winner.
9. The tournament runs each of its sub-tournaments to find semifinalists.
10. Each sub-tournament plays through its matches to find its winner.
11. The Jester comments on each match and prints its commentary to the console.
12. Each match runs through successive rounds of combat until a winner is found.
13. The sub-tournaments present their champions to the main tournament.
14. The main tournament has the semi-finalists fight using wild combat rules.
15. The main tournament has its finalists fight using wild combat rules.
16. The tournament presents its winner to menu.
17. Menu prints the winner to the console
