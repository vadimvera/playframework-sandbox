import play.sbt.PlayJava
import play.sbt.PlayLayoutPlugin
import play.sbt.PlayPekkoHttp2Support

lazy val root = (project in file("."))
    .disablePlugins(PlayLayoutPlugin)
    .enablePlugins(PlayJava, PlayPekkoHttp2Support)

description := "Getting started with Play Framework"

javacOptions ++= Seq("-encoding", "UTF-8", "-parameters")

libraryDependencies += guice

name := "playframework-sandbox"

organization := "org.acme"
organizationName := "Acme Corp."

scalaVersion := "2.13.12"

version := "0.2.0-SNAPSHOT"
