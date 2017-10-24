# fs-collections

Collection classes for Scala.

Dependens only on https://github.com/frozenspider/fs-common-utils

Cross-compiled for Scala 2.11 and 2.12,
published via [JitPack](https://jitpack.io/#frozenspider/fs-collections).

[![JitPack](https://jitpack.io/v/frozenspider/fs-collections.svg)](https://jitpack.io/#frozenspider/fs-collections)
[![Build Status](https://travis-ci.org/frozenspider/fs-collections.svg?branch=master)](https://travis-ci.org/frozenspider/fs-collections)
[![codecov.io](http://codecov.io/github/frozenspider/fs-collections/coverage.svg?branch=master)](http://codecov.io/github/frozenspider/fs-collections?branch=master)


## Overview

This library contains collection classes.
So far, this library only contains table implementations.


### Tables

Represented by two main traits `IndexedTable` and `KeyTable`, which are designed
to represents a two-dimensional `Seq` and `Map` like structures.
(Their respective default implementations are `IndexedSeqTable` and `MapKeyTable`).

Some details of their behaviour differs greatly between them - namely, sorting and adding/removing
rows/columns.

Tables are also supplied with `toString` implementation producing a pretty-print like this:

```
IndexedTable  MapKeyTable
+-+-+--+-+-+  +-+-+--+-+-+
| |0|1 |2|3|  | |a|b |c|d|
+-+-+--+-+-+  +-+-+--+-+-+
|0|A|B | | |  |5|A|B | | |
+-+-+--+-+-+  +-+-+--+-+-+
|1| |CD| | |  |4| |CD| | |
+-+-+--+-+-+  +-+-+--+-+-+
|2| |  | | |  |3| |  | | |
+-+-+--+-+-+  +-+-+--+-+-+
```

`IndexedTable` and `KeyTable` are considered to be relatively independant and never equal to each other.
