package com.dzr.common.redis.cache.mybatis;

import redis.clients.jedis.ShardedJedis;

public interface RedisCallback {

//	Object doWithRedis(Jedis jedis);

	Object doWithRedis(ShardedJedis jedis);
}
