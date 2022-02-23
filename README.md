# RubiksCubeSolver
A Rubik's Cube Solver written in Java.

# Numerical Mapping
Below, you can see the `char[] cube = new char[54];` array that represents the Rubik's Cube:

![Rubik's Cube Numerical Map](Documentation/pics/Rubiks-Cube-Solver-Map.png)

# Cases for recognizing when to use algorithms

For example, let's say a case is that:
For the algorithm to be used,
cube spot 5 and 7 need to be white color, and cube spot 6 needs to be green.
```
public static char[] CaseExample(char[] cube)
{
    if (cube[4] == 'W' && cube[5] == 'G' && cube[6] == 'W')
    {
        // do the algorithm here
        cube = AlgorithmExample(cube);
    }
    return cube;
}
```

# Algorithms
```
public static char[] AlgorithmExample(char[] cube)
{
    cube = B_Move(cube);
    cube = F_Prime_Move(cube);
    cube = L_Prime_Move(cube);
    return cube;
}
```
