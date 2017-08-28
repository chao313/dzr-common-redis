package com.dzr.common.redis.dataSource;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


public interface RedisDataSource {
    ShardedJedisPool getShardedJedisPool();

    public abstract ShardedJedis getRedisClient();

    public void returnResource(ShardedJedis shardedJedis);

    public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
