/**
 * 
 */
package com.raphaellevy.cs1.rockpaperscissors;

/**
 * An action that can be passed to an object such as a {@link ConsoleMenuItem}
 * to be executed by an object such as a {@link ConsoleMenu}
 * 
 * @author raffa
 */

@FunctionalInterface
interface Action {
	abstract void run();
}
