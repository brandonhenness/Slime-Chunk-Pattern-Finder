# Slime Chunk Pattern Finder

This project provides a Java-based tool to identify clusters of slime chunks in Minecraft worlds. By utilizing the Minecraft world seed and chunk coordinates, the program determines slime chunk locations and highlights areas with significant slime chunk density.

## Features

- Checks if a specific chunk is a slime chunk using Minecraft's slime chunk generation algorithm.
- Scans a defined area of the world for clusters of slime chunks.
- Outputs slime chunk cluster information, including:
  - Chunk coordinates
  - World coordinates
  - Nether coordinates
  - Number of slime chunks in the cluster

## Usage

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Basic knowledge of compiling and running Java programs.

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/brandonhenness/Slime-Chunk-Pattern-Finder.git
   cd Slime-Chunk-Pattern-Finder
   ```

2. Compile the `checkSlimechunk.java` file:
   ```bash
   javac checkSlimechunk.java
   ```

3. Run the program:
   ```bash
   java checkSlimechunk
   ```

4. Modify the following parameters in the `main` method to suit your needs:
   - `seed`: The Minecraft world seed as a 64-bit long literal.
   - `X` and `Z`: The area size in chunks to scan.
   - `threshold`: The minimum number of slime chunks in a cluster to report.

### Output Format

The program prints results to the console in the following format:
```
Slimechunks: [count]/12 | Chunk Cords: [x],[z] | Cords: [world_x],[world_z] | Nether Cords: [nether_x],[nether_z]
```

## Example

Given a seed of `132389425772377`, an area size of `100000 x 100000` chunks, and a threshold of `10`, the program will scan the area and output information about high-density slime chunk clusters.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.

## License

This project is licensed under the GNU General Public License v3.0 (GPLv3). See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by Minecraft's chunk generation algorithm.
- Thanks to the Minecraft community for their interest in slime chunk mechanics.

