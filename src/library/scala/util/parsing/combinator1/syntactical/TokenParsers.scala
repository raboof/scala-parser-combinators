/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2006-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: TokenParsers.scala 12242 2007-07-09 09:43:09Z michelou $


package scala.util.parsing.combinator1.syntactical

/** <p>
 *    This is the core component for token-based parsers.
 *  </p>
 *  <p>
 *    @requires lexical a component providing the tokens consumed by the
 *    parsers in this component.
 *  </p>
 *
 *  @author Martin Odersky, Adriaan Moors
 */
trait TokenParsers extends Parsers {
  /** Tokens is the abstract type of the `Token's consumed by the parsers in this component*/
  type Tokens <: scala.util.parsing.syntax.Tokens

  /** lexical is the component responsible for consuming some basic kind of
   *  input (usually character-based) and turning it into the tokens
   *  understood by these parsers.
   */
  val lexical: Tokens

  /** The input-type for these parsers*/
  type Elem = lexical.Token

}

